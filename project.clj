(defproject ericdallo/sqlite-jni-graal-fix "0.0.3-graalvm-21.1.0"
  :description "A fix for sqlite issue with jni missing classes in GraalVM native-image."
  :license {:name "Eclipse Public License 1.0"
            :url "http://opensource.org/licenses/eclipse-1.0.php"}
  :url "https://github.com/ericdallo/sqlite-jni-graal-fix"
  :scm {:name "git"
        :url "https://github.com/ericdallo/sqlite-jni-graal-fix"}
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [org.xerial/sqlite-jdbc "3.34.0"]
                 [org.graalvm.nativeimage/svm "21.1.0"]]
  :java-source-paths ["src-java"]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass
                                    :sign-releases false}]]
  :profiles {:uberjar {:aot :all}})
