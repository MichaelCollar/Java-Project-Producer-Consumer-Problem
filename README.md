# Java-Project-Producer-Consumer-Problem

A student project at the Polish-Japanese Academy of Information Technology regarding Producer-Consumer problem.

The code, running in the first thread, reads from the text file ../Towary.txt information about the products, creates objects of the class Product, containing read data and writes data on the number of objects created to the console (every 200 objects).

The code running in another thread analyzes these objects, sums up the weight of products and writes the total weight of every 100 objects to the console. At the end it writes the total weight of all products.

Ensure synchronization and coordination of both threads.
