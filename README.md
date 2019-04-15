# nuid.exception

Cross-platform exception facilities.

## Requirements

[`jvm`](https://www.java.com/en/download/), [`node + npm`](https://nodejs.org/en/download/), [`clj`](https://clojure.org/guides/getting_started), [`shadow-cljs`](https://shadow-cljs.github.io/docs/UsersGuide.html#_installation)

## From Clojure and ClojureScript

### tools.deps:

`{nuid/exception {:git/url "https://github.com/nuid/exception" :sha "..."}}`

### usage:

```
$ clj # or shadow-cljs node-repl
=> (require '[nuid.exception :as exception])
=> (exception/throw! {:message "I failed!"})
```

## Notes

Because this library exists as a common interface over exception facilities, it probably won't be very useful in host environments. The below is included just in case.

## From JavaScript

### node:

```
$ shadow-cljs release node
$ node
> var Exception = require('./target/node/nuid_exception');
> Exception.throw({"message": "Darn!"})
```

### browser:

```
$ shadow-cljs release browser
## go use ./target/browser/nuid_exception.js in a browser script
```

## From Java

To call `nuid.exception` from Java or other JVM languages, use one of the recommended interop strategies ([var/IFn](https://clojure.org/reference/java_interop#_calling_clojure_from_java) or [uberjar/aot](https://push-language.hampshire.edu/t/calling-clojure-code-from-java/865)). Doing so may require modifications or additions to the API for convenience.

## From CLR

Coming soon.

## Notes

The purpose of `nuid.exception` and sibling `nuid` libraries is to abstract over platform-specific differences and provide a common interface to fundamental dependencies. This allows us to express dependent logic once in pure Clojure(Script), and use it from each of the host platforms (Java, JavaScript, CLR). Along with [`tools.deps`](https://clojure.org/guides/deps_and_cli), this approach yields the code-sharing, circular-dependency avoidance, and local development benefits of a monorepo, with the modularity and orthogonality of an isolated library.

## Licensing

Apache v2.0 or MIT

## Contributing

Install [`git-hooks`](https://github.com/icefox/git-hooks) and fire away. Make sure not to get bitten by [`externs`](https://clojurescript.org/guides/externs) if modifying `npm` dependencies.

### formatting:

```
$ clojure -A:cljfmt            # check
$ clojure -A:cljfmt:cljfmt/fix # fix
```

### dependencies:

```
## check
$ npm outdated 
$ clojure -A:depot

## update
$ npm upgrade -s
$ clojure -A:depot:depot/update
```
