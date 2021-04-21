# sqlite-jni-graal-fix

[![Clojars Project](https://img.shields.io/clojars/v/ericdallo/sqlite-jni-graal-fix.svg)](https://clojars.org/ericdallo/sqlite-jni-graal-fix)

_A fix for an issue with JNI missing sqlite classes in GraalVM native-image._

## Usage

Just add this lib to your app classpath, for example using `lein`:

```clojure
(defproject sample "1.0.0"
  ...
  :profiles {:native-image 
              {:dependencies [[ericdallo/sqlite-jni-graal-fix "0.0.2-graalvm-21.1.0"]]}})
```
