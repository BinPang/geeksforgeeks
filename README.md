##how to get class `Node` and other

* open `chrome inspect`
* open `Network`
* open `XHR`
* find `getsolution.php?pid=xxxxxxxx` like:[Demo](https://practice.geeksforgeeks.org/ajax/getsolution.php?pid=700164 "Title")


## fatal error: 'bits/stdc++.h' file not found
* ln -s /usr/local/Cellar/gcc/8.2.0/include/c++/8.2.0/x86_64-apple-darwin18.0.0/bits /usr/local/include/
* g++ xxx.cpp
