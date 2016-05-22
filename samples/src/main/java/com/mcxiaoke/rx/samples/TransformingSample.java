package com.mcxiaoke.rx.samples;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func0;
import rx.functions.Func1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * User: mcxiaoke
 * Date: 15/7/28
 * Time: 16:37
 */
public class TransformingSample {


    /**
     * output
     * onNext: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
     * onNext: [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
     * onNext: [20, 21, 22, 23, 24, 25, 26, 27, 28, 29]
     * onCompleted
     */
    // Observable<List<T>> buffer(int count)
    public static void buffer1() {
        Observable.range(0, 30).buffer(10).subscribe(new Observer<List<Integer>>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(final Throwable e) {
                System.err.println("onError: " + e);
            }

            @Override
            public void onNext(final List<Integer> i) {
                System.out.println("onNext: " + i);
            }
        });
    }

    /**
     * output
     * onNext: [0, 1, 2, 3, 4]
     * onNext: [3, 4, 5, 6, 7]
     * onNext: [6, 7, 8, 9]
     * onNext: [9]
     * onCompleted
     */
    // Observable<List<T>> buffer(int count, int skip)
    public static void buffer2() {
        Observable.range(0, 10).buffer(5, 3).subscribe(new Observer<List<Integer>>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(final Throwable e) {
                System.err.println("onError: " + e);
            }

            @Override
            public void onNext(final List<Integer> i) {
                System.out.println("onNext: " + i);
            }
        });
    }

    /**
     * onNext: [100, 101]
     * onNext: [102, 103, 104]
     * onNext: [105, 106, 107]
     * onNext: [108, 109, 110]
     * onNext: []
     * onCompleted
     */
    //  <TClosing> Observable<List<T>> buffer(Func0<? extends
    // Observable<? extends TClosing>> bufferClosingSelector)
    public static void buffer3() {
        Observable.create(new OnSubscribe<Integer>() {
            @Override
            public void call(final Subscriber<? super Integer> subscriber) {
                for (int i = 100; i < 120; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onNext(i);
                    }
                }
                subscriber.onCompleted();
            }
        }).buffer(new Func0<Observable<Integer>>() {
            @Override
            public Observable<Integer> call() {
                return Observable.just(100).delay(300, TimeUnit.MILLISECONDS).repeat(4);
            }
        }).subscribe(new Observer<List<Integer>>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(final Throwable e) {
                System.err.println("onError: " + e);
            }

            @Override
            public void onNext(final List<Integer> i) {
                System.out.println("onNext: " + i);
            }
        });
    }

    /**
     * onNext: Mapped Item 2
     * onNext: Mapped Item 4
     * onNext: Mapped Item 6
     * onNext: Mapped Item 8
     * onNext: Mapped Item 10
     * onCompleted
     */
    // <R> Observable<R> map(Func1<? super T, ? extends R> func)
    public static void map() {
        Observable.just(1, 2, 3, 4, 5).map(new Func1<Integer, String>() {
            @Override
            public String call(final Integer integer) {
                return "Mapped Item " + integer * 2;
            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(final Throwable e) {
                System.err.println("onError: " + e);
            }

            @Override
            public void onNext(final String i) {
                System.out.println("onNext: " + i);
            }
        });
    }

    public static void cast() {
        Observable.just(new StringBuilder("String"))
                .cast(CharSequence.class).subscribe(new Observer<CharSequence>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(final Throwable e) {
                System.err.println("onError: " + e);
            }

            @Override
            public void onNext(final CharSequence i) {
                System.out.println("onNext: " + i);
            }
        });
    }

    /**
     * onNext: List Item 0
     * onNext: List Item 2
     * onNext: List Item 4
     * onNext: List Item 6
     * onNext: List Item 8
     * onCompleted
     */
    // <R> Observable<R> flatMap(Func1<? super T, ? extends Observable<? extends R>> func)
    public static void flatMap1() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i += 2) {
            strings.add("List Item " + i);
        }
        Observable.just(strings).flatMap(
                new Func1<List<String>, Observable<String>>() {
                    @Override
                    public Observable<String> call(final List<String> strings) {
                        return Observable.from(strings);
                    }
                }).subscribe(new Observer<String>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(final Throwable e) {
                System.err.println("onError: " + e);
            }

            @Override
            public void onNext(final String i) {
                System.out.println("onNext: " + i);
            }
        });
    }

    public static void main(String[] args) {
//        buffer1();
//        buffer2();
//        buffer3();
//        map();
//        cast();
        flatMap1();
    }
}
