package co.novemberfive.kotlin.sample

/*
 * This file is part of kotlin-mpp-standard.
 * 
 * Created by Arne Stockmans on 17/09/2018
 * 
 * (c) 2018 November Five BVBA
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

object HelloWorld {

    /**
     * Will send a message from the shared codebase
     */
    fun commonCode(): String {
        return "Hello from common code"
    }
}

expect fun HelloWorld.platformSpecificCode(): String
