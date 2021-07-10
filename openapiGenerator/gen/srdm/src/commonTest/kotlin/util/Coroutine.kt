/**
* idpManager API Specification
* このドキュメントは、idpManagerのAPI仕様書です。
*
* The version of the OpenAPI document: 2.11.0.18
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

package util

import kotlinx.coroutines.CoroutineScope

/**
* Block the current thread until execution of the given coroutine is complete.
*
* @param block The coroutine code.
* @return The result of the coroutine.
*/
internal expect fun <T> runTest(block: suspend CoroutineScope.() -> T): T
