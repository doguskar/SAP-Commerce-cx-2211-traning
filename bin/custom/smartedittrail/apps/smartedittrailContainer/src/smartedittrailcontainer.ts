/*
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { IFeatureService, moduleUtils, SeEntryModule, EditorFieldMappingService, SeRouteService, MessageModule } from 'smarteditcommons';
import { AbAnalyticsToolbarItemComponent } from './abAnalyticsToolbarItem';
import { DummyInterceptor } from './DummyInterceptor';
import {ToolbarModule} from 'smarteditcontainer';
import { TrailPageViewComponent } from './trailPage/TrailPageViewComponent';

@SeEntryModule('smartedittrailContainer')
@NgModule({
    imports: [
        BrowserModule,
        MessageModule,
        UpgradeModule,
        SeRouteService.provideNgRoute([
            {
                path: 'ng/trail',
                component: TrailPageViewComponent
            }
        ])
    ],
    declarations: [TrailPageViewComponent],
    entryComponents: [],
    providers: [
        {
            provide: HTTP_INTERCEPTORS,
            useClass: DummyInterceptor,
            multi: true
        },
        moduleUtils.bootstrap(
            (editorFieldMappingService: EditorFieldMappingService) => {
                // Adds the mapping. With this the new widget will be used for all fields of type "Range"
                editorFieldMappingService.addFieldMapping('Range', null, null, {
                    template: 'rangeFieldTemplate.html'
                });
            },
            [EditorFieldMappingService]
        )
    ]
})
export class SmartedittrailContainerModule {}
