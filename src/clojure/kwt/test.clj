(ns kwt.test
  (:require [kwt.in :as in]))

(def msg (.getBytes "AOyXz4vqMBDH/5c5tzJpEtvmJu8qHkR48B5Sspq1ZWvrNvXHIv7vO6m6W0VPy94CQ2G+35lk8ulpjrAzjS3qClSapgGs9apYgJIopIiTVDLJ4ihBidx55ABiqHVI32tAAPvc0AEQIRMhYyHyGcYqkkrEA5FyhpHk/6jMmvdquwbFJJdxAHpji3V2J071sqgtqP9HWOS6qkwJCgOYHbKXj9bYSx2SNO1JEXLBu6rNW0sKx5iJruQmn9SFNdlrWdcNqDBhAYx2q6yxtqB0yE/B71/K3Cm9W4U8zQP4Ox5NqKPaliUlf87v/+J9GwRyrG2bNYfOReLtYoaounCke5MPkzSKbwd3b+nNfSV/l5Ovac6lbnXW6NYQksGZwCOZqst6b2iuBw1PHOrJi1X+pOmZ1cE7XOQO4re4aJvyKrq/6RF6hB6hR+gReoQeoUfoEXqEHuHPEc7dWlN1i4rbWU6fAQAA//8="))

(comment
  (in/->json msg))
