Adicione essa sequence no diretorio de synapse 
<API_Gateway>/repository/deployment/server/synapse-configs/default/sequences

<sequence xmlns="http://ws.apache.org/ns/synapse" name="WSO2AM--Ext--In">
    <class name="com.wso2.apimanager.extension.TransactionIdGenarator"></class>
    <header expression="get-property('TransactionID')" name="TRANSACTION_ID" scope="transport"/>
</sequence>
