Langtons Ants
=============
A simple Turing machine which operates on a grid of black and white cells,
and follows two simple rules on every tick of a clock:

* At a white square, turn 90° right, flip the color of the square, 
  move forward one unit

* At a black square, turn 90° left, flip the color of the square, 
  move forward one unit

Mostly the output trail produces a pseudo-random irregular pattern, but
after about 10,000 generations, a recurrent highway pattern breaks away 
from the main body.

See http://langtons-ants.destructuring-bind.org for a running example.

Building and Running
====================
The app runs inside a static lightweight WEBrick instance (the app is
nominally deployed on Heroku), so Ruby and bundle are pre-requisites:

    $ sudo apt-get install bundle
    $ bundle install

The compiled javascript is already versioned in git, so start the 
appserver and browse to [http://localhost:9292]

    $ rackup

By default one ant is automatically created; Extra ants may be added
by clicking on the canvas.

Editing Code
============
Don't try to edit the javascript - is compiled from ClojureScript in
`src/ants/core.cljs` using Leiningen with the lein-cljsbuild plugin:

    $ lein cljsbuild clean
    $ lein cljsbuild auto

Refresh the page in the browser after having saved the file and allow
for the compilation phase to complete.

Notes
=====
* Google Chrome 22.0.1229.94 does not yield the expected output, whereas
  Firefox 20.0a1 does produce the breakout highways properly. This might 
  be down to Chrome's implementation of _Canvas.getImageData()_.

* Each ant is Turing complete, thus is capable of capable of universal 
  computation.
