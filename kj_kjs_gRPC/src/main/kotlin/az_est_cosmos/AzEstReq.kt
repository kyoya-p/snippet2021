package az_est_cosmos

import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val channel = ManagedChannelBuilder.forTarget("localhost:50051").usePlaintext().build()!!
    //val channel = ManagedChannelBuilder.forTarget("xxx:443").useTransportSecurity().build()!!

    val client = AzEstCosmosGrpcKt.AzEstCosmosCoroutineStub(channel)
    val res = client.estimate(estimateReq { //TODO
        loginInfo {}
        params.add(estParams { })
        params.add(estParams { })
    })
    println("res:${res.resultsList}")
}

