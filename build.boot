(set-env!
 :dependencies  '[[org.clojure/clojure       "1.7.0"]
                  [adzerk/bootlaces          "0.1.13" :scope "test"]
                  [degree9/lounge.boot       "0.1.0"  :scope "test"]
                  [degree9/boot-semver       "0.6.0"  :scope "test"]]
 :resource-paths   #{"src"})

(require
 '[adzerk.bootlaces :refer :all]
 '[boot-semver.core :refer :all]
 '[lounge.boot :refer :all])

(task-options!
 pom {:project 'degree9/lounge.report
      :description ""
      :url         ""
      :scm {:url ""}})
