package com.github.iamkatrechko.extensions.kotlin

import org.junit.Assert
import org.junit.Test

class AnyExtTest {

    @Test
    fun simpleTest() {
        val clazz = TestClass()
        val clazzTag = clazz.TAG

        Assert.assertEquals(clazzTag, "TestClass")
    }

    @Test
    fun staticInnerClassTest() {
        val tag = TestClass().getTagFromLambda()

        Assert.assertEquals(tag, "TestClass")
    }

    @Test
    fun funInnerClassTest() {
        class InnerTestClass() {

            fun getTag(): String {
                return { TAG }.invoke()
            }
        }

        val tag = InnerTestClass().getTag()

        Assert.assertEquals(tag, "funInnerClassTest\$InnerTestClass")
    }

    class TestClass {

        fun getTagFromLambda(): String {
            return { TAG }.invoke()
        }
    }
}
