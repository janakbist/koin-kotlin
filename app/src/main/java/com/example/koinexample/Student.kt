package com.example.koinexample

class Student(val courses :StudentCource,val friends :StudentFriend) {

            fun details() {
                courses.subject()
                friends.bestFriend()
            }
}

class StudentCource {
    fun subject () {
        print("Android Programming")
    }
}
class StudentFriend {
    fun bestFriend () {
        print("Janak")
    }
}
