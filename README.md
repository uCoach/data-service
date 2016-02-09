#Main Data Service

The data service is a wrapper service that integrates internal-data-service and external-data-service and provides a REST interface to the System Logic Layer.

For more information and list of resources provided see the [Wiki](../../wiki)

###DEPENDENCIES

	# Authorization keys
	export INTERNAL_DATA_AUTH_KEY="internal_data_auth_key"
	export EXTERNAL_DATA_AUTH_KEY="external_data_auth_key"
	export DATA_AUTH_KEY="data_auth_key"

###HOW TO RUN

	git clone https://github.com/uCoach/data-service.git
	cd data-service
	ant run

#####Deployed on Heorku:

  	https://ucoach-data-service.herokuapp.com
