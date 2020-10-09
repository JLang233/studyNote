
class Queue{
    constructor() {
	this.data = [];
	this.length = 0;
    }

    //入队
    enqueue(item) {
        this.data.push(item);
        this.length++;
	// your code
    }

    //出队
    dequeue() {
        let b = new Array;
        for(let i = 0; i < this.length; i++){
            b.push(this.data.pop());
        }
        let item = b.pop();
        this.length--;
        for(let i = 0; i < this.length; i++){
            this.data.push(b.pop());
        }
        return item;
	// your code
    }
    //判空
    isEmpty() {
        return this.length == 0;
    // your code
    }
}

let q = new Queue();
for(let i = 1; i < 10; i++) {
    q.enqueue(i);
}

while(!q.isEmpty()) {
    console.log(q.dequeue());
}

//q.dequeue();