// Functions のエントリ

package com.example

import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import java.io.BufferedWriter

class Example : HttpFunction {
    @Throws(Exception::class)
    override fun service(request: HttpRequest?, response: HttpResponse) {
        val writer: BufferedWriter = response.getWriter()
        writer.write("Hello world!")
    }
}