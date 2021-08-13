package az_est_cosmos

import io.grpc.ServerBuilder

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 50051
    val server = ServerBuilder.forPort(port)
        .addService(object : AzEstCosmosGrpcKt.AzEstCosmosCoroutineImplBase() {
            override suspend fun estimate(req: EstimateReq) = estimateRes {
//TODO サーバロジック本体
                for (i in req.paramsList) {
                    results.add(estResult {
                        storageCostPerMonth = "1"
                        throughputRequired = "2"
                        workloadCostPerMonth = "4"
                        totalCostPerMonth = "3"
                    })
                }
            }})
            .build()!!
            server.start()
            Runtime.getRuntime().addShutdownHook(
            Thread
            {
                println("*** shutting down gRPC server since JVM is shutting down")
                server.shutdown()
                println("*** server shut down")
            }
            )
            println("gRPC server started on port $port.")
            server.awaitTermination()
        }