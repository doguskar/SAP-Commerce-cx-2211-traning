import { Component } from '@angular/core';
import {
    IAlertService,
    IToolbarServiceFactory,
    ToolbarSection,
    ToolbarItemType
} from 'smarteditcommons';

@Component({
    selector: 'se-component-trail-page-view',
    templateUrl: './TrailPageViewComponent.html'
})
export class TrailPageViewComponent {
    constructor(
        private toolbarServiceFactory: IToolbarServiceFactory,
        private alertService: IAlertService
    ) {
        const smartEditTrailPageToolbarService = this.toolbarServiceFactory.getToolbarService(
            'smartEditTrailToolbar'
        );
        smartEditTrailPageToolbarService.addItems([
            {
                key: 'se.trail.page.button',
                type: ToolbarItemType.ACTION,
                nameI18nKey: 'Trail',
                component: TrailPageViewComponent,
                priority: 1,
                section: ToolbarSection.left,
                iconClassName: 'icon-duplicate se-toolbar-menu-ddlb--button__icon',
                callback: () => {
                    this.alertService.showInfo('Hello from the trail');
                }
            }
        ]);
    }
}