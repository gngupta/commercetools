package com.commercetools.dataimport.categories;

import com.commercetools.dataimport.LocalizedField;
import lombok.Data;

@Data
public class CategoryCsvEntry {

    private LocalizedField name = new LocalizedField();
    private LocalizedField slug = new LocalizedField();
    private String parentKey;
    private String key;
    private String externalId;
    private String webImageUrl;
    private String iosImageUrl;
}
