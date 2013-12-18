Session Bean pattern for Spring MVC
========

This is the companion code for [http://thecodersbreakfast.net/index.php?post/2013/09/12/Impl%C3%A9menter-le-pattern-Session-Object-avec-Spring-MVC]

It demonstrates how to implement the Session Bean pattern in Spring MVC.
The goal is to have a single bean in the user's session, instead of using the low-level HTTP session as a mere map.

The principal benefit is that the session bean provides strongly typed fields, accessors, and even utility methods, and centralizes all session data.
I believe it to be a better alternative than Spring's @SessionAttributes mechanism, because it allows a more fine-grained control over the data's lifecycle, especially when they are destroyed.


