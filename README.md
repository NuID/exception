<p align="right"><a href="https://nuid.io"><img src="https://nuid.io/svg/logo.svg" width="20%"></a></p>

# nuid.exception

Cross-platform exception facilities.

## Requirements

[`jvm`](https://www.java.com/en/download/), [`node + npm`](https://nodejs.org/en/download/), [`clj`](https://clojure.org/guides/getting_started), [`shadow-cljs`](https://shadow-cljs.github.io/docs/UsersGuide.html#_installation)

## Clojure and ClojureScript

### tools.deps:

`{nuid/exception {:git/url "https://github.com/nuid/exception" :sha "..."}}`

### usage:

```
$ clj # or shadow-cljs node-repl
=> (require '[nuid.exception :as exception])
=> (exception/throw! {:message "I failed!"})
```

## Licensing

Apache v2.0 or MIT
