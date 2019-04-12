(ns nuid.exception)

(defn throw!
  [{:keys [message exception]
    :or {exception #?(:clj (Exception. message)
                      :cljs (js/Error. message))}}]
  (throw exception))

#?(:cljs (def exports #js {:throw #(throw! (js->clj % :keywordize-keys true))}))
