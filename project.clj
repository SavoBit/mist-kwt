(defproject kwt "0.1.0"
  :description "Transforms Web-socket messages"
  :repositories [["java.net" "http://download.java.net/maven/2"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.codec "0.1.0"]
                 [us.b3k.kafka/kafka-websocket "0.8.1-SNAPSHOT"]])
