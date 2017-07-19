'use strict';

describe('Stack', function(){
    

    it('should be size zero',function(){
        expect(myStack().size()).toEqual(0);
    });

    it('push item, check size is 1',function(){
        var stack = myStack();
        stack.push('Hello');
        expect(stack.size()).toEqual(1);
    });

    it('push item, check size is 1',function(){
        var stack = myStack();
        stack.push('Hello');
        stack.push('Hi');
        expect(stack.size()).toEqual(2);
    });

    it('pop item, check size is 0',function(){
        var stack = myStack();
        stack.pop();
        expect(stack.size()).toEqual(0);
    });

    it('pop item, check pop value',function(){
        var stack = myStack();
        var head = stack.pop();
        expect(head).toEqual('');
        expect(stack.size()).toEqual(0);
    });

    it('push then pop, check size is 0',function(){
        var stack = myStack();
        stack.push('Hello');
        stack.pop();
        expect(stack.size()).toEqual(0);
    });

    it('push two pop one, check size is 1',function(){
        var stack = myStack();
        stack.push('Hello');
        stack.push('Hi');
        stack.pop();
        expect(stack.size()).toEqual(1);
    });

    it('push then read pop, check pop equals push',function(){
        var stack = myStack();
        stack.push('String');
        var head = stack.pop();
        expect(head).toEqual('String');
    });

    it('push two, pop one, check the value was the first in', function(){
        var stack = myStack();
        stack.push('String');
        stack.push('Hello');
        var firstin = stack.pop();
        expect(firstin).toEqual('Hello');
        expect(stack.size()).toEqual(1);
    });

    it('push two, pop one, check the value was the first in', function(){
        var stack = myStack();
        stack.push('String');
        stack.push('Hello');
        var lastin = stack.pop();
        expect(lastin).toEqual('Hello');
        expect(stack.size()).toEqual(1);
        var firstin = stack.pop();
        expect(firstin).toEqual('String');
        expect(stack.size()).toEqual(0);
    });

});