(ns kwt.mist
  (require '[clojure.data.codec.base64 :as b64]
           '[clojure.java.io :as io])
  (require '[kwt.core :as kwt]))

(defn unbase64 [m]
  (b64/decode m))

(defn remove-first-byte [m]
  (when (= (first m) 0)
    (rest m)))

(defn zlib-inflate [m]
  (when m
    (to-byte-array (InflaterInputStream. (ByteArrayInputStream. m)))))

(defn extract [msg]
  (-> msg
      unbase64
      remove-first-byte
      zlib-inflate))

(kwt/route {:route :kafka
            :host  "localhost"
            :port  8999}
           (transform msg))
