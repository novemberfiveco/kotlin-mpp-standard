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

import co.novemberfive.kotlin.sample.HelloWorld.commonCode
import kotlin.test.Test
import kotlin.test.assertEquals

class HelloWorldTest {

    @Test
    fun commonCodeTest() {
        val commonCodeTest = commonCode()
        assertEquals("Hello from common code", commonCodeTest)
    }
}