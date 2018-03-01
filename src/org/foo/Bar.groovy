package org.foo

class Bar implements Serializable {
    def x
    def y

    Bar(y) {
        //this.x = x
        this.y = y
    }
    void getVars() {
        println  this.y
    }
}