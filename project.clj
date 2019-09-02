(defproject b-social/zebra "0.1.8-SNAPSHOT"
  :description "A clojure wrapper for Stripe"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.stripe/stripe-java "10.12.1"]]
  :plugins [[jonase/eastwood "0.2.5"]]
  :eastwood {:config-files ["config/linter.clj"]})
