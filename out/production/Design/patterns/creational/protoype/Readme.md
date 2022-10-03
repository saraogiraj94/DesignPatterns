<h1>Prototype Pattern</h1>

Its a creational pattern where in if we want to have copy/clone of one object.

So there is initial state of an object which need to be replicated in the new objects created we can use prototype pattern.

<h2>Use Case</h2>
Wherever creation of initial state of an object is fixed and is costly operation we can minimize using prototype.

For Example : **Case of Fetching data from database**.

Suppose we need to fetch details everytime we create an object and this details are fixed and aren't changing. In that case by using proxy pattern we can minimize the database call to once and reuse/clone the first created object to fetch details.

<h2>Approach</h2>
Using Cloneable Marker interface and overriding clone method of object class.

Things to take care that cloning is shallow copy and for deep copy we need to handle on our own.