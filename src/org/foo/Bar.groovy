package org.foo

class Bar implements Serializable {
    def script
    def config
    
    Bar(config) {
        //this.x = x
        // this.script = script
        this.config = config
    }
    def getVars() {
        return  this.config
    }
}