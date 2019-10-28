docker build --build-arg url=https://github.com/bbitanalytics/afb-skeleton-api-server.git\
  --build-arg project=afb-skeleton-api-server\
  --build-arg artifactid=api-skeleton\
  --build-arg version=1.0-SNAPSHOT\
  -t bbitanalytics/afb-skeleton-api-server - < Dockerfile
