/**
 * @param {number} n
 * @return {Function} counter
 */
let count = 0;
const counterArray = [];
var createCounter = function(n) {
     return ()=> n++
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */