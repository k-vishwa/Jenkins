package org.foo

class Bar implements Serializable {
    def script
    def config

    Bar() {
    }

    Bar(script,config) {
        //this.x = x
        this.script = script
        this.config = config
    }
    void getVars() {
        println  this.config.var
    }
}