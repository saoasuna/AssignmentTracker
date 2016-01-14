# AssignmentTracker
android app
Assignment Tracker is an Android application that helps you stay on top of your work. Assignments are displayed using a RecyclerView and stored inside an SQLLiteDatabase. An AVL tree implementation offers quick sorting and allows checks for deadline conflicts. Users are able to share assignment files with one another over Wi-fi through Google’s Cloud Messaging API and Java Servlets. Notifications are pushed by the app whenever deadlines are approaching or another user is trying to share a file.

*** This specific version of AssignmentTracker uses a list rather than AVL tree (the AVL tree implementation is still included, just did not work as well with recyclerview as a list did. Comments explaining how to use the AVL tree (if desired) are in the code)
*** For the instant messaging capabilities and file sharing, this version uses google cloud messaging and servlets. The demo server (powered by google app engine) is listed on my github.