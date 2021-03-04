# Entity Cache module

When you have microflows that do a lot of retrieves of the same entity you can use this module to reduce the amount of database queries by storing them in the cache. The **Entity Cache module** support multiple entities but only stores one per type (like 1 systemsettings objec, 1 emailsettings object etc). 

## Performance

The test module has a some unittests that prove the performance of this module.

11 ms for 1000 retrieves from cache  vs  2476 ms for 1000 database retrieves !
![unittests](https://raw.githubusercontent.com/appronto/Entity-cache-module/main/Output/unittests.png)

## Current functions

 - JA_ReplaceEntityInCache
 - JA_RetrieveEntityFromCache
 - JA_RemoveEntityFromCache 

## Example microflow for get or create cached object

![microflow example](https://raw.githubusercontent.com/appronto/Entity-cache-module/main/Output/microflow.png)

Use this pattern to make sure you always have a correct object (either from the cache, from the database or, the newly created object).

