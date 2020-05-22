(ns nuid.exception)

(defn throw!
  [{::keys [message exception]
    :or    {message   "Error!"
            exception #?(:clj  (Exception. message)
                         :cljs (js/Error.  message))}}]
  (throw exception))
