(defproject maze "0.1.0-SNAPSHOT"
  :url "http://langtons-ants.destructuring-bind.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.0-beta1"]
                 [jayq "0.3.2"]
                 [crate "0.2.1"]
                 [rm-hull/monet "0.1.2-SNAPSHOT"]]
  :cljsbuild {
    :builds [
      {:source-path "src/langtons-ants"
       :compiler {:output-to "public/js/langtons-ants.js"
                  :optimizations :advanced
                  :externs ["externs/jquery-1.8.js" "externs/requestAnim.js"]
                  :print-input-delimiter true
                  :pretty-print true}}]}
  :hooks [leiningen.cljsbuild]
  :plugins [[lein-cljsbuild "0.2.9"]]
  :profiles {:dev {:dependencies [[vimclojure/server "2.3.6"]]}}
  :min-lein-version "2.0.0"
  :warn-on-reflection true
  :description "A web-based Langton's Ants Turing machine")
