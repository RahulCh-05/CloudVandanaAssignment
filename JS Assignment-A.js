var sentence = prompt();
var words = sentence.split(" ");

    var reversedWords = words.map(function (word) {
        return word.split('').reverse().join('');
    });

var reversedSentence = reversedWords.join(" ");
console.log(reversedSentence);