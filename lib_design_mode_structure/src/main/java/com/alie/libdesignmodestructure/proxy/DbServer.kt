package com.alie.libdesignmodestructure.proxy

interface DbServer {
    fun init()
    fun connect()
    fun shutDown()
}

class AlieDbServer:DbServer {
    var tag  = this.javaClass.simpleName
    override fun init() {
        print("$tag==init()")
    }

    override fun connect() {
        print("$tag==connect()")
    }

    override fun shutDown() {
        print("$tag==shutDown()")
    }
}

class AlieDbServerProxy(private val dbServer: AlieDbServer):DbServer {
    override fun init() {
        println("===AlieDbServerProxy init")
        dbServer.init()
    }

    override fun connect() {
        println("===AlieDbServerProxy connect")
        dbServer.connect()
    }

    override fun shutDown() {
        println("===AlieDbServerProxy shutDown")
        dbServer.connect()
    }

}