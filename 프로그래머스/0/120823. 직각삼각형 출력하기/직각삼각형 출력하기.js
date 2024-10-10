const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    let n = Number(line); 
    for (let i = 1; i <= n; i++) {
        console.log('*'.repeat(i)); 
    }
    rl.close();
});