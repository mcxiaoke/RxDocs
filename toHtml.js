var fs = require('fs');

var Markdown = require('markdown-to-html').Markdown;
var md = new Markdown();

var fileName = process.argv[2];
var outputName = process.argv[3];

var opts = {title: 'File $BASENAME in $DIRNAME', stylesheet: 'test/style.css'};

var filePath = outputName;
var writeStream;

md.bufmax = 2048;

writeStream = fs.createWriteStream(outputName);

// Write a trailer at eof.
md.once('end', function() {
  
});
md.render(fileName, opts, function(err) {
  if (err) {
    console.error('>>>' + err);
    process.exit();
  }
  md.pipe(writeStream);
});