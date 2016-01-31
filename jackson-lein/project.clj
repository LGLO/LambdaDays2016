(defproject jsonlint "0.0.1-SNAPSHOT"
  :description "Example pure Frege language application"
  :url "http://www.lambdadays.org/#programme"
  ;; Frege is typically a BSD license
  :license {:name "BSD 3-clause"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [;; need to depend on Frege for runtime:
                 [org.frege-lang/frege "3.23.450-SNAPSHOT"]
                 [com.fasterxml.jackson.core/jackson-databind "2.6.4"]]
  :repositories {"sonatype" "https://oss.sonatype.org/content/repositories/snapshots/"}
  :plugins [[lein-fregec "3.23.450"]]
  :frege-source-paths ["src/main/frege" "src/test/frege"]
  :java-source-paths ["src/main/java"] 
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
