(defproject kwt "0.1.0"
  :description "Transforms web-socket messages"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure          "1.6.0"]
                 [org.clojure/data.codec       "0.1.0"]
                 [org.mistsys/kafka-websocket "0.8.1"]

                 [stylefruits/gniazdo          "0.3.0"]
                 [javax.websocket/javax.websocket-api "1.0"]
                 [org.apache.kafka/kafka_2.9.2 "0.8.1"]

                 [log4j "1.2.15" :exclusions [javax.mail/mail
                                              javax.jms/jms
                                              com.sun.jdmk/jmxtools
                                              com.sun.jmx/jmxri]]
                 
                 [com.google.code.gson/gson    "2.2.4"]
                 [com.google.guava/guava       "16.0.1"]

                 [org.eclipse.jetty/jetty-server "9.1.3.v20140225"]
                 [org.eclipse.jetty.websocket/javax-websocket-server-impl "9.1.3.v20140225"]
                 
                 [org.clojure/tools.nrepl      "0.2.5"]
                 [cider/cider-nrepl            "0.8.1"]]
  
  :repositories [["java.net" "http://download.java.net/maven/2"]
                 ["sonatype" {:url "http://oss.sonatype.org/content/groups/public"
                              }]]

  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  
  :main kwt.core)
