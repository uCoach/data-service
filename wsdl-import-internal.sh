cd src
wsimport -keep -p ucoach.data.internal.ws $1/ws/google-tokens?wsdl
wsimport -keep -p ucoach.data.internal.ws $1/ws/user?wsdl
wsimport -keep -p ucoach.data.internal.ws $1/ws/healthmeasure?wsdl
wsimport -keep -p ucoach.data.internal.ws $1/ws/goal?wsdl
cd ..
