(ns mist.kwt
  (require '[clojure.data.codec.base64 :as b64]
           '[clojure.java.io :as io])
  (:gen-class
   :extends us.b3k.kafka.ws.transforms.Transform
   :name mist.kwt.Transform))

(defn unbase64 [m]
  (b64/decode m))

(defn remove-first-byte [m]
  (when (= (first m) 0)
    (rest m)))

(defn zlib-inflate [m]
  (when m
    (to-byte-array (InflaterInputStream. (ByteArrayInputStream. m)))))

(defn ->json [msg]
  (-> msg
      unbase64
      remove-first-byte
      zlib-inflate))

(proxy [Transform]
      (transform [^TextMessage msg ^Session session]
                 (->json msg)))
