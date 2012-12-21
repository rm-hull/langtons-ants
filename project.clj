(defproject maze "0.1.0-SNAPSHOT"
  :url "http://langtons-ants.destructuring-bind.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0-beta1"]
                 [jayq "1.0.0"]
                 [rm-hull/monet "0.1.3-SNAPSHOT"]]
  :cljsbuild {
    :builds [
      {:source-path "src/ants"
       :compiler {:output-to "public/js/ants.js"
                  ;:optimizations :whitespace
                  :optimizations :advanced
                  :externs ["externs/jquery-1.8.js" "externs/requestAnim.js"]
                  :print-input-delimiter true
                  :pretty-print true}}]}
  :plugins [[lein-cljsbuild "0.2.10"]]
  :profiles {:dev {:dependencies [[vimclojure/server "2.3.6"]]}}
  :min-lein-version "2.0.0"
  :warn-on-reflection true
  :description "A web-based Langton's Ants Turing machine")
