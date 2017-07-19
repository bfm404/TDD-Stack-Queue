'use strict';

var myStack = function () {

    var count = 0;
    var array = [];

    var size = function () {
        return count;
    }

    var push = function(itemToPush) {
        count++;
        array.push(itemToPush);
    }

    var pop = function(){
        if(count>0){
            count--;
            //var pop = array.pop();
            return array.pop();
        }
        else {
            return '';
        }

    }

    return {
        size: size,
        push: push,
        pop: pop
    }

}