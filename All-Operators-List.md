## 按字母顺序排列的全部操作符列表

* **`aggregate( )`** — _see [**`reduce( )`**](operators/Mathematical-and-Aggregate-Operators.md#reduce)_
* [**`all( )`**](operators/Conditional-and-Boolean-Operators.md#all) — determine whether all items emitted by an Observable meet some criteria
* [**`amb( )`**](operators/Conditional-and-Boolean-Operators.md#amb) — given two or more source Observables, emits all of the items from the first of these Observables to emit an item
* **`ambWith( )`** — _instance version of [**`amb( )`**](operators/Conditional-and-Boolean-Operators.md#amb)_
* [**`and( )`**](operators/Combining-Observables.md#and-then-and-when) — combine the emissions from two or more source Observables into a `Pattern` (`rxjava-joins`)
* **`apply( )`** (scala) — _see [**`create( )`**](operators/Creating-Observables#create)_
* **`asObservable( )`** (kotlin) — _see [**`from( )`**](operators/Creating-Observables#from) (et al.)_
* [**`asyncAction( )`**](operators/Async-Operators.md#toasync-or-asyncaction-or-asyncfunc) — convert an Action into an Observable that executes the Action and emits its return value (`rxjava-async`)
* [**`asyncFunc( )`**](operators/Async-Operators.md#toasync-or-asyncaction-or-asyncfunc) — convert a function into an Observable that executes the function and emits its return value (`rxjava-async`)
* [**`averageDouble( )`**](operators/Mathematical-and-Aggregate-Operators.md#averageinteger-averagelong-averagefloat-and-averagedouble) — calculates the average of Doubles emitted by an Observable and emits this average (`rxjava-math`)
* [**`averageFloat( )`**](operators/Mathematical-and-Aggregate-Operators.md#averageinteger-averagelong-averagefloat-and-averagedouble) — calculates the average of Floats emitted by an Observable and emits this average (`rxjava-math`)
* [**`averageInteger( )`**](operators/Mathematical-and-Aggregate-Operators.md#averageinteger-averagelong-averagefloat-and-averagedouble) — calculates the average of Integers emitted by an Observable and emits this average (`rxjava-math`)
* [**`averageLong( )`**](operators/Mathematical-and-Aggregate-Operators.md#averageinteger-averagelong-averagefloat-and-averagedouble) — calculates the average of Longs emitted by an Observable and emits this average (`rxjava-math`)
* **`blocking( )`** (clojure) — _see [**`toBlocking( )`**](operators/Blocking-Observable-Operators)_
* [**`buffer( )`**](operators/Transforming-Observables.md#buffer) — periodically gather items from an Observable into bundles and emit these bundles rather than emitting the items one at a time
* [**`byLine( )`**](operators/String-Observables.md#byline) (`StringObservable`) — converts an Observable of Strings into an Observable of Lines by treating the source sequence as a stream and splitting it on line-endings
* [**`cache( )`**](operators/Observable-Utility-Operators.md#cache) — remember the sequence of items emitted by the Observable and emit the same sequence to future Subscribers
* [**`cast( )`**](operators/Transforming-Observables.md#cast) — cast all items from the source Observable into a particular type before reemitting them
* **`catch( )`** (clojure) — _see [**`onErrorResumeNext( )`**](operators/Error-Handling-Operators.md#onerrorresumenext)_
* [**`chunkify( )`**](operators/Phantom-Operators.md#chunkify) — returns an iterable that periodically returns a list of items emitted by the source Observable since the last list (⁇)
* [**`collect( )`**](operators/Mathematical-and-Aggregate-Operators.md#collect) — collects items emitted by the source Observable into a single mutable data structure and returns an Observable that emits this structure
* [**`combineLatest( )`**](operators/Combining-Observables.md#combinelatest) — when an item is emitted by either of two Observables, combine the latest item emitted by each Observable via a specified function and emit items based on the results of this function
* **`combineLatestWith( )`** (scala) — _instance version of [**`combineLatest( )`**](operators/Combining-Observables#combinelatest)_
* [**`concat( )`**](operators/Mathematical-and-Aggregate-Operators.md#concat) — concatenate two or more Observables sequentially
* [**`concatMap( )`**](operators/Transforming-Observables.md#flatmap-concatmap-and-flatmapiterable) — transform the items emitted by an Observable into Observables, then flatten this into a single Observable, without interleaving
* **`concatWith( )`** — _instance version of [**`concat( )`**](operators/Mathematical-and-Aggregate-Operators.md#concat)_
* [**`connect( )`**](operators/Connectable-Observable-Operators.md#connectableobservableconnect) — instructs a Connectable Observable to begin emitting items
* **`cons( )`** (clojure) — _see [**`concat( )`**](operators/Mathematical-and-Aggregate-Operators.md#concat)_
* [**`contains( )`**](operators/Conditional-and-Boolean-Operators.md#contains) — determine whether an Observable emits a particular item or not
* [**`count( )`**](operators/Mathematical-and-Aggregate-Operators.md#count-and-countlong) — counts the number of items emitted by an Observable and emits this count
* [**`countLong( )`**](operators/Mathematical-and-Aggregate-Operators.md#count-and-countlong) — counts the number of items emitted by an Observable and emits this count
* [**`create( )`**](operators/Creating-Observables.md#create) — create an Observable from scratch by means of a function
* **`cycle( )`** (clojure) — _see [**`repeat( )`**](operators/Creating-Observables#repeat)_
* [**`debounce( )`**](operators/Filtering-Observables.md#throttlewithtimeout-or-debounce) — only emit an item from the source Observable after a particular timespan has passed without the Observable emitting any other items
* [**`decode( )`**](operators/String-Observables.md#decode) (`StringObservable`) — convert a stream of multibyte characters into an Observable that emits byte arrays that respect character boundaries
* [**`defaultIfEmpty( )`**](operators/Conditional-and-Boolean-Operators.md#defaultifempty) — emit items from the source Observable, or emit a default item if the source Observable completes after emitting no items
* [**`defer( )`**](operators/Creating-Observables.md#defer) — do not create the Observable until a Subscriber subscribes; create a fresh Observable on each subscription
* [**`deferFuture( )`**](operators/Async-Operators.md#deferfuture) — convert a Future that returns an Observable into an Observable, but do not attempt to get the Observable that the Future returns until a Subscriber subscribes (`rxjava-async`)
* [**`deferCancellableFuture( )`**](operators/Phantom-Operators.md#fromcancellablefuture-startcancellablefuture-and-defercancellablefuture-) — convert a Future that returns an Observable into an Observable in a way that monitors the subscription status of the Observable to determine whether to halt work on the Future, but do not attempt to get the returned Observable until a Subscriber subscribes (⁇)(`rxjava-async`)
* [**`delay( )`**](operators/Observable-Utility-Operators.md#delay) — shift the emissions from an Observable forward in time by a specified amount
* [**`dematerialize( )`**](operators/Observable-Utility-Operators.md#dematerialize) — convert a materialized Observable back into its non-materialized form
* [**`distinct( )`**](operators/Filtering-Observables.md#distinct) — suppress duplicate items emitted by the source Observable
* [**`distinctUntilChanged( )`**](operators/Filtering-Observables.md#distinctuntilchanged) — suppress duplicate consecutive items emitted by the source Observable
* **`do( )`** (clojure) — _see [**`doOnEach( )`**](operators/Observable-Utility-Operators.md#dooneach)_
* [**`doOnCompleted( )`**](operators/Observable-Utility-Operators.md#dooncompleted) — register an action to take when an Observable completes successfully
* [**`doOnEach( )`**](operators/Observable-Utility-Operators.md#dooneach) — register an action to take whenever an Observable emits an item
* [**`doOnError( )`**](operators/Observable-Utility-Operators.md#doonerror) — register an action to take when an Observable completes with an error
* **`doOnNext( )`** — _see [**`doOnEach( )`**](operators/Observable-Utility-Operators.md#dooneach)_
* **`doOnRequest( )`** — register an action to take when items are requested from an Observable via reactive-pull backpressure (⁇)
* [**`doOnSubscribe( )`**](operators/Observable-Utility-Operators.md#doonsubscribe) — register an action to take when an observer subscribes to an Observable
* [**`doOnTerminate( )`**](operators/Observable-Utility-Operators.md#doonterminate) — register an action to take when an Observable completes, either successfully or with an error
* [**`doOnUnsubscribe( )`**](operators/Observable-Utility-Operators.md#doonunsubscribe) — register an action to take when an observer unsubscribes from an Observable
* [**`doWhile( )`**](operators/Conditional-and-Boolean-Operators.md#dowhile) — emit the source Observable's sequence, and then repeat the sequence as long as a condition remains true (`contrib-computation-expressions`)
* **`drop( )`** (scala/clojure) — _see [**`skip( )`**](operators/Filtering-Observables#skip)_
* **`dropRight( )`** (scala) — _see [**`skipLast( )`**](operators/Filtering-Observables#skiplast)_
* **`dropUntil( )`** (scala) — _see [**`skipUntil( )`**](operators/Conditional-and-Boolean-Operators.md#skipuntil)_
* **`dropWhile( )`** (scala) — _see [**`skipWhile( )`**](operators/Conditional-and-Boolean-Operators.md#skipwhile)_
* **`drop-while( )`** (clojure) — _see [**`skipWhile( )`**](operators/Conditional-and-Boolean-Operators.md#skipwhile)_
* [**`elementAt( )`**](operators/Filtering-Observables.md#elementat) — emit item _n_ emitted by the source Observable
* [**`elementAtOrDefault( )`**](operators/Filtering-Observables.md#elementatordefault) — emit item _n_ emitted by the source Observable, or a default item if the source Observable emits fewer than _n_ items
* [**`empty( )`**](operators/Creating-Observables.md#empty-error-and-never) — create an Observable that emits nothing and then completes
* [**`encode( )`**](operators/String-Observables.md#encode) (`StringObservable`) — transform an Observable that emits strings into an Observable that emits byte arrays that respect character boundaries of multibyte characters in the original strings
* [**`error( )`**](operators/Creating-Observables.md#empty-error-and-never) — create an Observable that emits nothing and then signals an error
* **`every( )`** (clojure) — _see [**`all( )`**](operators/Conditional-and-Boolean-Operators.md#all)_
* [**`exists( )`**](operators/Conditional-and-Boolean-Operators.md#exists-and-isempty) — determine whether an Observable emits any items or not
* [**`filter( )`**](operators/Filtering-Observables.md#filter) — filter items emitted by an Observable
* **`finally( )`** (clojure) — _see [**`finallyDo( )`**](operators/Observable-Utility-Operators.md#finallydo)_
* **`filterNot( )`** (scala) — _see [**`filter( )`**](operators/Filtering-Observables#filter)_
* [**`finallyDo( )`**](operators/Observable-Utility-Operators.md#finallydo) — register an action to take when an Observable completes
* [**`first( )`**](operators/Filtering-Observables.md#first-and-takefirst) (`Observable`) — emit only the first item emitted by an Observable, or the first item that meets some condition
* [**`first( )`**](operators/Blocking-Observable-Operators.md#first-and-firstordefault) (`BlockingObservable`) — emit only the first item emitted by an Observable, or the first item that meets some condition
* [**`firstOrDefault( )`**](operators/Filtering-Observables.md#firstordefault) (`Observable`) — emit only the first item emitted by an Observable, or the first item that meets some condition, or a default value if the source Observable is empty
* [**`firstOrDefault( )`**](operators/Blocking-Observable-Operators.md#first-and-firstordefault) (`BlockingObservable`) — emit only the first item emitted by an Observable, or the first item that meets some condition, or a default value if the source Observable is empty
* **`firstOrElse( )`** (scala) — _see [**`firstOrDefault( )`**](operators/Filtering-Observables#firstordefault) or [**`firstOrDefault( )`**](operators/Blocking-Observable-Operators.md#first-and-firstordefault) (`BlockingObservable`)_
* [**`flatMap( )`**](operators/Transforming-Observables.md#flatmap-concatmap-and-flatmapiterable) — transform the items emitted by an Observable into Observables, then flatten this into a single Observable
* [**`flatMapIterable( )`**](operators/Transforming-Observables.md#flatmap-concatmap-and-flatmapiterable) — create Iterables corresponding to each emission from a source Observable and merge the results into a single Observable
* **`flatMapIterableWith( )`** (scala) — _instance version of [**`flatMapIterable( )`**](operators/Transforming-Observables#flatmap-concatmap-and-flatmapiterable)_
* **`flatMapWith( )`** (scala) — _instance version of [**`flatmap( )`**](operators/Transforming-Observables#flatmap-concatmap-and-flatmapiterable)_
* **`flatten( )`** (scala) — _see [**`merge( )`**](operators/Combining-Observables#merge)_
* **`flattenDelayError( )`** (scala) — _see [**`mergeDelayError( )`**](operators/Combining-Observables#mergedelayerror)_
* **`foldLeft( )`** (scala) — _see [**`reduce( )`**](operators/Mathematical-and-Aggregate-Operators.md#reduce)_
* **`forall( )`** (scala) — _see [**`all( )`**](operators/Conditional-and-Boolean-Operators.md#all)_
* **`forEach( )`** (`Observable`) — _see [**`subscribe( )`**](operators/Observable#onnext-oncompleted-and-onerror)_
* [**`forEach( )`**](operators/Blocking-Observable-Operators.md#foreach) (`BlockingObservable`) — invoke a function on each item emitted by the Observable; block until the Observable completes
* [**`forEachFuture( )`**](operators/Async-Operators.md#foreachfuture) (`Async`) — pass Subscriber methods to an Observable but also have it behave like a Future that blocks until it completes (`rxjava-async`)
* [**`forEachFuture( )`**](operators/Phantom-Operators.md#foreachfuture) (`BlockingObservable`)— create a futureTask that will invoke a specified function on each item emitted by an Observable (⁇)
* [**`forIterable( )`**](operators/Phantom-Operators.md#foriterable) — apply a function to the elements of an Iterable to create Observables which are then concatenated (⁇)
* [**`from( )`**](operators/Creating-Observables.md#from) — convert an Iterable, a Future, or an Array into an Observable
* [**`from( )`**](operators/String-Observables.md#from) (`StringObservable`) — convert a stream of characters or a Reader into an Observable that emits byte arrays or Strings
* [**`fromAction( )`**](operators/Async-Operators.md#fromaction) — convert an Action into an Observable that invokes the action and emits its result when a Subscriber subscribes (`rxjava-async`)
* [**`fromCallable( )`**](operators/Async-Operators.md#fromcallable) — convert a Callable into an Observable that invokes the callable and emits its result or exception when a Subscriber subscribes (`rxjava-async`)
* [**`fromCancellableFuture( )`**](operators/Phantom-Operators.md#fromcancellablefuture-startcancellablefuture-and-defercancellablefuture-) — convert a Future into an Observable in a way that monitors the subscription status of the Observable to determine whether to halt work on the Future, but do not attempt to get the Future's value until a Subscriber subscribes (⁇)(`rxjava-async`)
* **`fromFunc0( )`** — _see [**`fromCallable( )`**](operators/Async-Operators.md#fromcallable) (`rxjava-async`)_
* [**`fromFuture( )`**](operators/Phantom-Operators.md#fromfuture) — convert a Future into an Observable, but do not attempt to get the Future's value until a Subscriber subscribes (⁇)
* [**`fromRunnable( )`**](operators/Async-Operators.md#fromrunnable) — convert a Runnable into an Observable that invokes the runable and emits its result when a Subscriber subscribes (`rxjava-async`)
* [**`generate( )`**](operators/Phantom-Operators.md#generate-and-generateabsolutetime) — create an Observable that emits a sequence of items as generated by a function of your choosing (⁇)
* [**`generateAbsoluteTime( )`**](operators/Phantom-Operators.md#generate-and-generateabsolutetime) — create an Observable that emits a sequence of items as generated by a function of your choosing, with each item emitted at an item-specific time (⁇)
* **`generator( )`** (clojure) — _see [**`generate( )`**](operators/Phantom-Operators.md#generate-and-generateabsolutetime)_
* [**`getIterator( )`**](operators/Blocking-Observable-Operators.md#transformations-tofuture-toiterable-and-getiterator) — convert the sequence emitted by the Observable into an Iterator
* [**`groupBy( )`**](operators/Transforming-Observables.md#groupby) — divide an Observable into a set of Observables that emit groups of items from the original Observable, organized by key
* **`group-by( )`** (clojure) — _see [**`groupBy( )`**](operators/Transforming-Observables#groupby)_
* [**`groupByUntil( )`**](operators/Phantom-Operators.md#groupbyuntil) — a variant of the [`groupBy( )`](Transforming-Observables.md#groupby) operator that closes any open GroupedObservable upon a signal from another Observable (⁇)
* [**`groupJoin( )`**](operators/Combining-Observables.md#join-and-groupjoin) — combine the items emitted by two Observables whenever one item from one Observable falls within a window of duration specified by an item emitted by the other Observable
* **`head( )`** (scala) — _see [**`first( )`**](operators/Blocking-Observable-Operators.md#first-and-firstordefault) (`BlockingObservable`)_
* **`headOption( )`** (scala) — _see [**`firstOrDefault( )`**](operators/Filtering-Observables#firstordefault) or [**`firstOrDefault( )`**](operators/Blocking-Observable-Operators.md#first-and-firstordefault) (`BlockingObservable`)_
* **`headOrElse( )`** (scala) — _see [**`firstOrDefault( )`**](operators/Filtering-Observables#firstordefault) or [**`firstOrDefault( )`**](operators/Blocking-Observable-Operators.md#first-and-firstordefault) (`BlockingObservable`)_
* [**`ifThen( )`**](operators/Conditional-and-Boolean-Operators.md#ifthen) — only emit the source Observable's sequence if a condition is true, otherwise emit an empty or default sequence (`contrib-computation-expressions`)
* [**`ignoreElements( )`**](operators/Filtering-Observables.md#ignoreelements) — discard the items emitted by the source Observable and only pass through the error or completed notification
* [**`interval( )`**](operators/Creating-Observables.md#interval) — create an Observable that emits a sequence of integers spaced by a given time interval
* **`into( )`** (clojure) — _see [**`reduce( )`**](operators/Mathematical-and-Aggregate-Operators.md#reduce)_
* [**`isEmpty( )`**](operators/Conditional-and-Boolean-Operators.md#exists-and-isempty) — determine whether an Observable emits any items or not
* **`items( )`** (scala) — _see [**`just( )`**](operators/Creating-Observables#just)_
* [**`join( )`**](operators/Combining-Observables.md#join-and-groupjoin) — combine the items emitted by two Observables whenever one item from one Observable falls within a window of duration specified by an item emitted by the other Observable
* [**`join( )`**](operators/String-Observables.md#join) (`StringObservable`) — converts an Observable that emits a sequence of strings into an Observable that emits a single string that concatenates them all, separating them by a specified string
* [**`just( )`**](operators/Creating-Observables.md#just) — convert an object into an Observable that emits that object
* [**`last( )`**](operators/Blocking-Observable-Operators.md#last-and-lastordefault) (`BlockingObservable`) — block until the Observable completes, then return the last item emitted by the Observable
* [**`last( )`**](operators/Filtering-Observables.md#last) (`Observable`) — emit only the last item emitted by the source Observable
* **`lastOption( )`** (scala) — _see [**`lastOrDefault( )`**](operators/Filtering-Observables#lastOrDefault) or [**`lastOrDefault( )`**](operators/Blocking-Observable-Operators.md#last-and-lastordefault) (`BlockingObservable`)_
* [**`lastOrDefault( )`**](operators/Blocking-Observable-Operators.md#last-and-lastordefault) (`BlockingObservable`) — block until the Observable completes, then return the last item emitted by the Observable or a default item if there is no last item
* [**`lastOrDefault( )`**](operators/Filtering-Observables.md#lastOrDefault) (`Observable`) — emit only the last item emitted by an Observable, or a default value if the source Observable is empty
* **`lastOrElse( )`** (scala) — _see [**`lastOrDefault( )`**](operators/Filtering-Observables#lastOrDefault) or [**`lastOrDefault( )`**](operators/Blocking-Observable-Operators.md#last-and-lastordefault) (`BlockingObservable`)_
* [**`latest( )`**](operators/Blocking-Observable-Operators.md#latest) — returns an iterable that blocks until or unless the Observable emits an item that has not been returned by the iterable, then returns the latest such item
* **`length( )`** (scala) — _see [**`count( )`**](operators/Mathematical-and-Aggregate-Operators.md#count-and-countlong)_
* **`limit( )`** — _see [**`take( )`**](operators/Filtering-Observables#take)_
* **`longCount( )`** (scala) — _see [**`countLong( )`**](operators/Mathematical-and-Aggregate-Operators.md#count-and-countlong)_
* [**`map( )`**](operators/Transforming-Observables.md#map) — transform the items emitted by an Observable by applying a function to each of them
* **`mapcat( )`** (clojure) — _see [**`concatMap( )`**](operators/Transforming-Observables#flatmap-concatmap-and-flatmapiterable)_
* **`mapMany( )`** — _see: [**`flatMap( )`**](operators/Transforming-Observables#flatmap-concatmap-and-flatmapiterable)_
* [**`materialize( )`**](operators/Observable-Utility-Operators.md#materialize) — convert an Observable into a list of Notifications
* [**`max( )`**](operators/Mathematical-and-Aggregate-Operators.md#max) — emits the maximum value emitted by a source Observable (`rxjava-math`)
* [**`maxBy( )`**](operators/Mathematical-and-Aggregate-Operators.md#maxby) — emits the item emitted by the source Observable that has the maximum key value (`rxjava-math`)
* [**`merge( )`**](operators/Combining-Observables.md#merge) — combine multiple Observables into one
* [**`mergeDelayError( )`**](operators/Combining-Observables.md#mergedelayerror) — combine multiple Observables into one, allowing error-free Observables to continue before propagating errors
* **`merge-delay-error( )`** (clojure) — _see [**`mergeDelayError( )`**](operators/Combining-Observables#mergedelayerror)_
* **`mergeMap( )`** * — _see: [**`flatMap( )`**](operators/Transforming-Observables#flatmap-concatmap-and-flatmapiterable)_
* **`mergeMapIterable( )`** — _see: [**`flatMapIterable( )`**](operators/Transforming-Observables#flatmap-concatmap-and-flatmapiterable)_
* **`mergeWith( )`** — _instance version of [**`merge( )`**](operators/Combining-Observables#merge)_
* [**`min( )`**](operators/Mathematical-and-Aggregate-Operators.md#min) — emits the minimum value emitted by a source Observable (`rxjava-math`)
* [**`minBy( )`**](operators/Mathematical-and-Aggregate-Operators.md#minby) — emits the item emitted by the source Observable that has the minimum key value (`rxjava-math`)
* [**`mostRecent( )`**](operators/Blocking-Observable-Operators.md#mostrecent) — returns an iterable that always returns the item most recently emitted by the Observable
* [**`multicast( )`**](operators/Phantom-Operators.md#multicast) — represents an Observable as a Connectable Observable
* [**`never( )`**](operators/Creating-Observables.md#empty-error-and-never) — create an Observable that emits nothing at all
* [**`next( )`**](operators/Blocking-Observable-Operators.md#next) — returns an iterable that blocks until the Observable emits another item, then returns that item
* **`nonEmpty( )`** (scala) — _see [**`isEmpty( )`**](operators/Conditional-and-Boolean-Operators.md#exists-and-isempty)_
* **`nth( )`** (clojure) — _see [**`elementAt( )`**](operators/Filtering-Observables#elementat) and [**`elementAtOrDefault( )`**](operators/Filtering-Observables#elementatordefault)_
* [**`observeOn( )`**](operators/Observable-Utility-Operators.md#observeon) — specify on which Scheduler a Subscriber should observe the Observable
* [**`ofType( )`**](operators/Filtering-Observables.md#oftype) — emit only those items from the source Observable that are of a particular class
* [**`onBackpressureBlock( )`**](operators/Backpressure) — block the Observable's thread until the Observer is ready to accept more items from the Observable (⁇)
* [**`onBackpressureBuffer( )`**](operators/Backpressure) — maintain a buffer of all emissions from the source Observable and emit them to downstream Subscribers according to the requests they generate
* [**`onBackpressureDrop( )`**](operators/Backpressure) — drop emissions from the source Observable unless there is a pending request from a downstream Subscriber, in which case emit enough items to fulfill the request
* [**`onErrorFlatMap( )`**](operators/Phantom-Operators.md#onerrorflatmap) — instructs an Observable to emit a sequence of items whenever it encounters an error (⁇)
* [**`onErrorResumeNext( )`**](operators/Error-Handling-Operators.md#onerrorresumenext) — instructs an Observable to emit a sequence of items if it encounters an error
* [**`onErrorReturn( )`**](operators/Error-Handling-Operators.md#onerrorreturn) — instructs an Observable to emit a particular item when it encounters an error
* [**`onExceptionResumeNext( )`**](operators/Error-Handling-Operators.md#onexceptionresumenext) — instructs an Observable to continue emitting items after it encounters an exception (but not another variety of throwable)
* **`orElse( )`** (scala) — _see [**`defaultIfEmpty( )`**](operators/Conditional-and-Boolean-Operators.md#defaultifempty)_
* [**`parallel( )`**](operators/Phantom-Operators.md#parallel) — split the work done on the emissions from an Observable into multiple Observables each operating on its own parallel thread (⁇)
* [**`parallelMerge( )`**](operators/Phantom-Operators.md#parallelmerge) — combine multiple Observables into smaller number of Observables (⁇)
* [**`pivot( )`**](operators/Phantom-Operators.md#pivot) — combine multiple sets of grouped observables so that they are arranged primarily by group rather than by set (⁇)
* [**`publish( )`**](operators/Connectable-Observable-Operators.md#observablepublish) — represents an Observable as a Connectable Observable
* [**`publishLast( )`**](operators/Phantom-Operators.md#publishlast) — represent an Observable as a Connectable Observable that emits only the last item emitted by the source Observable (⁇)
* [**`range( )`**](operators/Creating-Observables.md#range) — create an Observable that emits a range of sequential integers
* [**`reduce( )`**](operators/Mathematical-and-Aggregate-Operators.md#reduce) — apply a function to each emitted item, sequentially, and emit only the final accumulated value
* **`reductions( )`** (clojure) — _see [**`scan( )`**](operators/Transforming-Observables#scan)_
* [**`refCount( )`**](operators/Connectable-Observable-Operators.md#connectableobservablerefcount) — makes a Connectable Observable behave like an ordinary Observable
* [**`repeat( )`**](operators/Creating-Observables.md#repeat) — create an Observable that emits a particular item or sequence of items repeatedly
* [**`repeatWhen( )`**](operators/Creating-Observables.md#repeatwhen) — create an Observable that emits a particular item or sequence of items repeatedly, depending on the emissions of a second Observable
* [**`replay( )`**](operators/Connectable-Observable-Operators.md#observablereplay) — ensures that all Subscribers see the same sequence of emitted items, even if they subscribe after the Observable begins emitting the items
* **`rest( )`** (clojure) — _see [**`next( )`**](operators/Blocking-Observable-Operators.md#next)_
* **`return( )`** (clojure) — _see [**`just( )`**](operators/Creating-Observables#just)_
* [**`retry( )`**](operators/Error-Handling-Operators.md#retry) — if a source Observable emits an error, resubscribe to it in the hopes that it will complete without error
* [**`retrywhen( )`**](operators/Error-Handling-Operators.md#retrywhen) — if a source Observable emits an error, pass that error to another Observable to determine whether to resubscribe to the source
* [**`runAsync( )`**](operators/Async-Operators.md#runasync) — returns a `StoppableObservable` that emits multiple actions as generated by a specified Action on a Scheduler (`rxjava-async`)
* [**`sample( )`**](operators/Filtering-Observables.md#sample-or-throttlelast) — emit the most recent items emitted by an Observable within periodic time intervals
* [**`scan( )`**](operators/Transforming-Observables.md#scan) — apply a function to each item emitted by an Observable, sequentially, and emit each successive value
* **`seq( )`** (clojure) — _see [**`getIterator( )`**](operators/Blocking-Observable-Operators.md#transformations-tofuture-toiterable-and-getiterator)_
* [**`sequenceEqual( )`**](operators/Conditional-and-Boolean-Operators.md#sequenceequal) — test the equality of sequences emitted by two Observables
* **`sequenceEqualWith( )`** (scala) — _instance version of [**`sequenceEqual( )`**](operators/Conditional-and-Boolean-Operators.md#sequenceequal)_
* [**`serialize( )`**](operators/Observable-Utility-Operators.md#serialize) — force an Observable to make serialized calls and to be well-behaved
* **`share( )`** — _see [**`refCount( )`**](operators/Connectable-Observable-Operators.md#connectableobservablerefcount)_
* [**`single( )`**](operators/Blocking-Observable-Operators.md#single-and-singleordefault) (`BlockingObservable`) — if the source Observable completes after emitting a single item, return that item, otherwise throw an exception
* [**`single( )`**](operators/Observable-Utility-Operators.md#single-and-singleordefault) (`Observable`) — if the source Observable completes after emitting a single item, emit that item, otherwise notify of an exception
* **`singleOption( )`** (scala) — _see [**`singleOrDefault( )`**](operators/Blocking-Observable-Operators.md#single-and-singleordefault) (`BlockingObservable`)_
* [**`singleOrDefault( )`**](operators/Blocking-Observable-Operators.md#single-and-singleordefault) (`BlockingObservable`) — if the source Observable completes after emitting a single item, return that item, otherwise return a default item
* [**`singleOrDefault( )`**](operators/Observable-Utility-Operators.md#single-and-singleordefault) (`Observable`) — if the source Observable completes after emitting a single item, emit that item, otherwise emit a default item
* **`singleOrElse( )`** (scala) — _see [**`singleOrDefault( )`**](operators/Observable-Utility-Operators.md#single-and-singleordefault)_
* **`size( )`** (scala) — _see [**`count( )`**](operators/Mathematical-and-Aggregate-Operators.md#count-and-countlong)_
* [**`skip( )`**](operators/Filtering-Observables.md#skip) — ignore the first _n_ items emitted by an Observable
* [**`skipLast( )`**](operators/Filtering-Observables.md#skiplast) — ignore the last _n_ items emitted by an Observable
* [**`skipUntil( )`**](operators/Conditional-and-Boolean-Operators.md#skipuntil) — discard items emitted by a source Observable until a second Observable emits an item, then emit the remainder of the source Observable's items
* [**`skipWhile( )`**](operators/Conditional-and-Boolean-Operators.md#skipwhile) — discard items emitted by an Observable until a specified condition is false, then emit the remainder
* **`sliding( )`** (scala) — _see [**`window( )`**](operators/Transforming-Observables#window)_
* **`slidingBuffer( )`** (scala) — _see [**`buffer( )`**](operators/Transforming-Observables#buffer)_
* [**`split( )`**](operators/String-Observables.md#split) (`StringObservable`) — converts an Observable of Strings into an Observable of Strings that treats the source sequence as a stream and splits it on a specified regex boundary
* [**`start( )`**](operators/Async-Operators.md#start) — create an Observable that emits the return value of a function (`rxjava-async`)
* [**`startCancellableFuture( )`**](operators/Phantom-Operators.md#fromcancellablefuture-startcancellablefuture-and-defercancellablefuture-) — convert a function that returns Future into an Observable that emits that Future's return value in a way that monitors the subscription status of the Observable to determine whether to halt work on the Future (⁇)(`rxjava-async`)
* [**`startFuture( )`**](operators/Async-Operators.md#startfuture) — convert a function that returns Future into an Observable that emits that Future's return value (`rxjava-async`)
* [**`startWith( )`**](operators/Combining-Observables.md#startwith) — emit a specified sequence of items before beginning to emit the items from the Observable
* [**`stringConcat( )`**](operators/String-Observables.md#stringconcat) (`StringObservable`) — converts an Observable that emits a sequence of strings into an Observable that emits a single string that concatenates them all
* [**`subscribeOn( )`**](operators/Observable-Utility-Operators.md#subscribeon) — specify which Scheduler an Observable should use when its subscription is invoked
* [**`sumDouble( )`**](operators/Mathematical-and-Aggregate-Operators.md#suminteger-sumlong-sumfloat-and-sumdouble) — adds the Doubles emitted by an Observable and emits this sum (`rxjava-math`)
* [**`sumFloat( )`**](operators/Mathematical-and-Aggregate-Operators.md#suminteger-sumlong-sumfloat-and-sumdouble) — adds the Floats emitted by an Observable and emits this sum (`rxjava-math`)
* [**`sumInteger( )`**](operators/Mathematical-and-Aggregate-Operators.md#suminteger-sumlong-sumfloat-and-sumdouble) — adds the Integers emitted by an Observable and emits this sum (`rxjava-math`)
* [**`sumLong( )`**](operators/Mathematical-and-Aggregate-Operators.md#suminteger-sumlong-sumfloat-and-sumdouble) — adds the Longs emitted by an Observable and emits this sum (`rxjava-math`)
* **`switch( )`** (scala) — _see [**`switchOnNext( )`**](operators/Combining-Observables#switchonnext)_
* [**`switchCase( )`**](operators/Conditional-and-Boolean-Operators.md#switchcase) — emit the sequence from a particular Observable based on the results of an evaluation (`contrib-computation-expressions`)
* [**`switchMap( )`**](operators/Transforming-Observables.md#switchmap) — transform the items emitted by an Observable into Observables, and mirror those items emitted by the most-recently transformed Observable
* [**`switchOnNext( )`**](operators/Combining-Observables.md#switchonnext) — convert an Observable that emits Observables into a single Observable that emits the items emitted by the most-recently emitted of those Observables
* **`synchronize( )`** — _see [**`serialize( )`**](operators/Observable-Utility-Operators.md#serialize)_
* [**`take( )`**](operators/Filtering-Observables.md#take) — emit only the first _n_ items emitted by an Observable
* [**`takeFirst( )`**](operators/Filtering-Observables.md#first-and-takefirst) — emit only the first item emitted by an Observable, or the first item that meets some condition
* [**`takeLast( )`**](operators/Filtering-Observables.md#takelast) — only emit the last _n_ items emitted by an Observable
* [**`takeLastBuffer( )`**](operators/Filtering-Observables.md#takelastbuffer) — emit the last _n_ items emitted by an Observable, as a single list item
* **`takeRight( )`** (scala) — _see [**`last( )`**](operators/Filtering-Observables#last) (`Observable`) or [**`takeLast( )`**](operators/Filtering-Observables#takelast)_
* [**`takeUntil( )`**](operators/Conditional-and-Boolean-Operators.md#takeuntil) — emits the items from the source Observable until a second Observable emits an item
* [**`takeWhile( )`**](operators/Conditional-and-Boolean-Operators.md#takewhile) — emit items emitted by an Observable as long as a specified condition is true, then skip the remainder
* **`take-while( )`** (clojure) — _see [**`takeWhile( )`**](operators/Conditional-and-Boolean-Operators.md#takewhile)_
* [**`then( )`**](operators/Combining-Observables.md#and-then-and-when) — transform a series of `Pattern` objects via a `Plan` template (`rxjava-joins`)
* [**`throttleFirst( )`**](operators/Filtering-Observables.md#throttlefirst) — emit the first items emitted by an Observable within periodic time intervals
* [**`throttleLast( )`**](operators/Filtering-Observables.md#sample-or-throttlelast) — emit the most recent items emitted by an Observable within periodic time intervals
* [**`throttleWithTimeout( )`**](operators/Filtering-Observables.md#throttlewithtimeout-or-debounce) — only emit an item from the source Observable after a particular timespan has passed without the Observable emitting any other items
* **`throw( )`** (clojure) — _see [**`error( )`**](operators/Creating-Observables#empty-error-and-never)_
* [**`timeInterval( )`**](operators/Observable-Utility-Operators.md#timeinterval) — emit the time lapsed between consecutive emissions of a source Observable
* [**`timeout( )`**](operators/Filtering-Observables.md#timeout) — emit items from a source Observable, but issue an exception if no item is emitted in a specified timespan
* [**`timer( )`**](operators/Creating-Observables.md#timer) — create an Observable that emits a single item after a given delay
* [**`timestamp( )`**](operators/Observable-Utility-Operators.md#timestamp) — attach a timestamp to every item emitted by an Observable
* [**`toAsync( )`**](operators/Async-Operators.md#toasync-or-asyncaction-or-asyncfunc) — convert a function or Action into an Observable that executes the function and emits its return value (`rxjava-async`)
* [**`toBlocking( )`**](operators/Blocking-Observable-Operators) — transform an Observable into a BlockingObservable
* **`toBlockingObservable( )`** - _see [**`toBlocking( )`**](operators/Blocking-Observable-Operators)_
* [**`toFuture( )`**](operators/Blocking-Observable-Operators.md#transformations-tofuture-toiterable-and-getiterator) — convert the Observable into a Future
* [**`toIterable( )`**](operators/Blocking-Observable-Operators.md#transformations-tofuture-toiterable-and-getiterator) — convert the sequence emitted by the Observable into an Iterable
* **`toIterator( )`** — _see [**`getIterator( )`**](operators/Blocking-Observable-Operators.md#transformations-tofuture-toiterable-and-getiterator)_
* [**`toList( )`**](operators/Mathematical-and-Aggregate-Operators.md#tolist) — collect all items from an Observable and emit them as a single List
* [**`toMap( )`**](operators/Mathematical-and-Aggregate-Operators.md#tomap-and-tomultimap) — convert the sequence of items emitted by an Observable into a map keyed by a specified key function
* [**`toMultimap( )`**](operators/Mathematical-and-Aggregate-Operators.md#tomap-and-tomultimap) — convert the sequence of items emitted by an Observable into an ArrayList that is also a map keyed by a specified key function
* **`toSeq( )`** (scala) — _see [**`toList( )`**](operators/Mathematical-and-Aggregate-Operators.md#tolist)_
* [**`toSortedList( )`**](operators/Mathematical-and-Aggregate-Operators.md#tosortedlist) — collect all items from an Observable and emit them as a single, sorted List
* **`tumbling( )`** (scala) — _see [**`window( )`**](operators/Transforming-Observables#window)_
* **`tumblingBuffer( )`** (scala) — _see [**`buffer( )`**](operators/Transforming-Observables#buffer)_
* [**`using( )`**](operators/Observable-Utility-Operators.md#using) — create a disposable resource that has the same lifespan as an Observable
* [**`when( )`**](operators/Combining-Observables.md#and-then-and-when) — convert a series of `Plan` objects into an Observable (`rxjava-joins`)
* **`where( )`** — _see: [**`filter( )`**](operators/Filtering-Observables#filter)_
* [**`whileDo( )`**](operators/Conditional-and-Boolean-Operators.md#whiledo) — if a condition is true, emit the source Observable's sequence and then repeat the sequence as long as the condition remains true (`contrib-computation-expressions`)
* [**`window( )`**](operators/Transforming-Observables.md#window) — periodically subdivide items from an Observable into Observable windows and emit these windows rather than emitting the items one at a time
* [**`zip( )`**](operators/Combining-Observables.md#zip) — combine sets of items emitted by two or more Observables together via a specified function and emit items based on the results of this function
* **`zipWith( )`** — _instance version of [**`zip( )`**](operators/Combining-Observables#zip)_
* **`zipWithIndex( )`** (scala) — _see [**`zip( )`**](operators/Combining-Observables#zip)_
* **`++`** (scala) — _see [**`concat( )`**](operators/Mathematical-and-Aggregate-Operators.md#concat)_
* **`+:`** (scala) — _see [**`startWith( )`**](operators/Combining-Observables#startwith)_

(⁇) — 表示这个操作符不是RxJava 1.0.0核心模块的组成部分
