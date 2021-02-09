package chapter7

package com {
  package test {
    class ClassInPackage {
      def test() = println("abc")
    }
  }
}

package net {
  package insideNet {
    object SomeClassInsideNet {
      def getName() = "SomeName"
    }
  }
}
