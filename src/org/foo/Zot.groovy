package org.foo;



class Zot {
    def checkOutFrom(repo) {
        git url: "git@github.com:jenkinsci/${repo}"
        return this
    }
}