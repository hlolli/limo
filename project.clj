(defproject limo "0.1.10-SNAPSHOT"
  :description "A clojure wrapper around selenium webdriver"
  :url "https://github.com/mayvenn/limo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.4.0"]
                 [org.seleniumhq.selenium/selenium-support "3.6.0"]
                 [org.seleniumhq.selenium/selenium-api "3.6.0"]
                 [org.seleniumhq.selenium/selenium-server "3.6.0"
                  :exclusions [org.seleniumhq.selenium/selenium-api
                               org.seleniumhq.selenium/selenium-support
                               org.eclipse.jetty/jetty-http
                               org.eclipse.jetty/jetty-io
                               org.eclipse.jetty/jetty-util]]
                 [org.seleniumhq.selenium/selenium-java "3.6.0"
                  :exclusions [org.seleniumhq.selenium/selenium-api
                               org.seleniumhq.selenium/selenium-support
                               org.eclipse.jetty/jetty-http
                               org.eclipse.jetty/jetty-io
                               org.eclipse.jetty/jetty-util]]
                 [org.seleniumhq.selenium/selenium-firefox-driver "3.6.0"]
                 [environ "1.1.0"]
                 [ring/ring-jetty-adapter "1.6.2"]]
  :profiles
  {:dev {:source-paths ["dev"]
         :dependencies [[pjstadig/humane-test-output "0.8.2"]
                        [org.clojure/tools.namespace "0.2.11"]]
         :plugins [[lein-cljfmt "0.5.6"]]
         :injections [(require 'pjstadig.humane-test-output)
                      (pjstadig.humane-test-output/activate!)]}})
