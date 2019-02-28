FROM httpd:2.4-alpine

COPY conf/ conf/extra/

RUN sed -i 's/#Include conf\/extra\/httpd-vhosts.conf/Include conf\/extra\/httpd-vhosts.conf/' conf/httpd.conf
RUN for module in proxy_module proxy_http_module proxy_ajp_module ssl_module socache_shmcb_module; do \
        sed -i "/^#LoadModule ${module}/s/^#//" conf/httpd.conf; \
    done
EXPOSE 80 443

