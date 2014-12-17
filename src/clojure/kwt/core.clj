(ns kwt.core
  (:require
   [clojure.tools.nrepl.server :as nrepl]
   [cider.nrepl :refer (cider-nrepl-handler)]))

(defn -main [& args]
  (println "Starting nREPL server on 9999")
  (nrepl/start-server :port 9999
                      :handler cider-nrepl-handler))
